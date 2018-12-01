package graph;

public class GraphObject extends Drawable {
	
	/**
	 * Funckja sprawdza czy kursor znajduje sie ponad obiektem
	 * @param mx x-owa wspolrzedna pozycji myszy
	 * @param my y-owa wspolrzedna pozycji myszy
	 * @return true jezeli mysz znajduje sie nad obiektem
	 */
	public Boolean hover(int mx, int my) {
		return false;
	}
	
	
	/**
	 * Funkcja przesuwa obiekt o dx w osi x i dy w osi y
	 * @param dx przesuniecie w osi x obiektu i jego dzieci
	 * @param dy przesuniecie w osi y obiekut i jego dzieci
	 */
	public void move(int dx, int dy) {
		
	}
	
}