package decorator_Plus_using;
/**
 * װ����ʵ����  A
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��24�� ����3:41:00
 */
public class ComponetImplA extends Decorator {

	public ComponetImplA(Component component) {
		super(component);
	}
	@Override
	void read() {
		// ��readǰ��������Զ��巽��
		//��ʵ����ԭread�����Ĺ�����չ
		this.extendReadA();
		super.read();     //ԭʼ��read����
		this.extendReadB();
	}
	
	//�Զ�����չ����
	private void extendReadA() {
		System.out.println("ComponetImplA ʵ�ֵķ���ǰ");
	}
	private void extendReadB() {
		System.out.println("ComponetImplA ʵ�ֵķ�����");
	}

}