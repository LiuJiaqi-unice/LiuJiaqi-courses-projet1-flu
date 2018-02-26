package joycjay;

public class main_map {
	
	static Object[][] map = new Object[4][4];
	
	static void initialize() {
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				map[i][j]=0;
			}
		}
		map[0][0]=9;
		map[1][1]=1;
		vivant v1 = new vivant("ljq",1,2);
		map[1][2] = v1;
		vivant v2 = new vivant("猪",2,2);
		map[2][2] = v2;
	}
	static void print_map() {
		for(int i = 0; i < map.length; i++){
			System.out.print("\n");
			for(int j = 0; j < map[i].length; j++){
				System.out.printf("-");
				if (map[i][j] instanceof vivant) {
					System.out.print(map[i][j]);
				}
				else {
					System.out.print(map[i][j]);
				}
				System.out.printf("- ");
			}
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args) {
		
		initialize();
		print_map();
		
		vivant v = (vivant)map[1][2];
		System.out.println(map[1][1].getClass());
		
		System.out.print("胖子zuo移");
		v.move(4,1,map);
		print_map();
		System.out.print("胖子shang移");
		v.move(8,1,map);
		print_map();
		System.out.print("胖子you移");
		v.move(6,1,map);
		print_map();
		System.out.print("胖子xia移2,遇上一头猪,失败了");
		v.move(2,2,map);
		print_map();
	}

}
