class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){ return hour; }
    public int getMinute(){ return minute; }
    public int getSecond(){ return second; }

    public void setHour(int hour){ this.hour = hour; }
    public void setMinute(int minute){ this.minute = minute; }
    public void setSecond(int second){ this.second = second; }
    public void setTime (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        if (this.hour < 10 && this.minute < 10 && this.second < 10){
            return "0" + this.hour + ":0" + this.minute + ":0" + this.second;
        }
        else if (this.hour < 10 && this.minute < 10){
            return "0" + this.hour + ":0" + this.minute + ":" + this.second;
        }
        else if (this.minute < 10 && this.second < 10){
            return  + this.hour + ":0" + this.minute + ":0" + this.second;
        }
        else if (this.hour < 10 && this.second < 10){
            return "0" + this.hour + ":" + this.minute + ":0" + this.second;
        }
        else if (this.hour < 10){
            return "0" + this.hour + ":" + this.minute + ":" + this.second;
        }
        else if (this.minute < 10){
            return this.hour + ":0" + this.minute + ":" + this.second;
        }
        else if (this.second < 10){
            return this.hour + ":" + this.minute + ":0" + this.second;
        }
        else{
            return this.hour + ":" + this.minute + ":" + this.second;
        }
    }

    public Time nextSecond(){
        if (this.second == 59){
            // System.out.println(1);
            this.second = 0;
            this.minute += 1;
            if(this.minute == 60){
                // System.out.println(2);
                this.minute = 0;
                this.hour += 1;
                    if (this.hour == 24){
                        // System.out.println(3);
                        this.hour = 0;
                        return this;
                    }else{
                        return this;
                    }
            }
            else{
                return this;
            }
        }
        else
            // System.out.println(5);
            this.second += 1;
            return this;
    }

    public Time previousSecond(){
        if (this.second == 0 && this.minute == 0 && this.hour == 0){
            this.hour = 23;
            this.minute = 59;
            this.second = 59;
            return this;
        }
        else if(second == 0 && minute == 0){
            this.second = 59;
            this.minute = 59;
            this.hour -= 1;
            return this;
        }
        else if(this.second == 0){
            this.second = 59;
            this.minute -= 1;
            return this;
        }
        else{
            this.second -=1;
            return this;
        }
    }
}