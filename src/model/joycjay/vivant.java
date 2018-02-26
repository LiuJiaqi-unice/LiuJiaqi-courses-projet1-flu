package joycjay;

public class vivant {
	String name;
	int x,y;
	
	vivant(String name,int x, int y){
		this.name = name;
		this.x=x;
		this.y=y;
	}
    public String toString(){
        return this.name;
    }
	Object move(int dircetion, int distance,Object[][] map) {
		switch(dircetion) {
		case 8:
			if(map[this.x][this.x - distance] instanceof Integer) {
				map[this.x][this.y]=0;
				this.x = this.x - distance;
				map[this.x][this.y]=this;
			}
			else {
				System.out.println("casse occupied");
			}
			break;
		case 2:
			if(map[this.x][this.x + distance] instanceof Integer) {
				map[this.x][this.y]=0;
				this.x = this.x + distance;
				map[this.x][this.y]=this;
			}
			else {
				System.out.print("\ncasse occupied");
			}
			break;
		case 6:
			if(map[this.x][this.y + distance] instanceof Integer) {
				map[this.x][this.y]=0;
				this.y = this.y + distance;
				map[this.x][this.y]=this;
			}
			else {
				System.out.print("\ncasse occupied");
			}
			break;
		case 4:
			if(map[this.x][this.y - distance] instanceof Integer) {
				map[this.x][this.y]=0;
				this.y = this.y - distance;
				map[this.x][this.y]=this;
			}
			else {
				System.out.print("\ncasse occupied");
			}
			break;
		default:
			System.out.print("\n移动出错，原地不动");
			break;
		}
		return map;
	}

}
