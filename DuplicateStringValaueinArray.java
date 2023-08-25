package JavaProgramm;

public class DuplicateStringValaueinArray {

	public static void main(String[] args) {

				String arr[] = {"java","c","c++","python","java"};
				
				
				boolean Element2 = false;
				
				for(int i = 0;i< arr.length;i++) {
					for (int j = i+1; j<arr.length;j++) {
						if (arr[i]==arr[j]) {
							System.out.println("Found Duplicate Element:"+ arr[i]);
						}
					}
					}
						if (Element2 = false) {
							System.out.println("Duplicate Element Not Found ");
							
						}
				}
			}



	


