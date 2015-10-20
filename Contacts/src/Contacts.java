import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Group;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Contacts {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Contacts window = new Contacts();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setMinimumSize(new Point(800, 600));
		shell.setModified(true);
		shell.setSize(506, 365);
		shell.setText("\u806F\u7D61\u4EBA\u7BA1\u7406");
		shell.setLayout(new FormLayout());
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem menuItem = new MenuItem(menu, SWT.CASCADE);
		menuItem.setText("\u6A94\u6848");
		
		Menu menu_1 = new Menu(menuItem);
		menuItem.setMenu(menu_1);
		
		MenuItem menuItem_2 = new MenuItem(menu_1, SWT.NONE);
		menuItem_2.setText("\u9078\u64C7\u8CC7\u6599\u5EAB");
		
		MenuItem menuItem_3 = new MenuItem(menu_1, SWT.NONE);
		menuItem_3.setText("\u65B0\u589E\u8CC7\u6599\u5EAB");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem menuItem_4 = new MenuItem(menu_1, SWT.NONE);
		menuItem_4.setText("\u532F\u5165");
		
		MenuItem menuItem_5 = new MenuItem(menu_1, SWT.NONE);
		menuItem_5.setText("\u532F\u51FA");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem menuItem_1 = new MenuItem(menu_1, SWT.NONE);
		menuItem_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				System.exit(0);
				
			}
		});
		menuItem_1.setText("\u96E2\u958B");
		
		MenuItem menuItem_9 = new MenuItem(menu, SWT.CASCADE);
		menuItem_9.setText("\u7DE8\u8F2F");
		
		Menu menu_3 = new Menu(menuItem_9);
		menuItem_9.setMenu(menu_3);
		
		MenuItem menuItem_6 = new MenuItem(menu, SWT.CASCADE);
		menuItem_6.setText("\u95DC\u65BC");
		
		Menu menu_2 = new Menu(menuItem_6);
		menuItem_6.setMenu(menu_2);
		
		MenuItem menuItem_8 = new MenuItem(menu_2, SWT.NONE);
		menuItem_8.setText("\u4F7F\u7528\u8AAA\u660E");
		
		MenuItem menuItem_7 = new MenuItem(menu_2, SWT.NONE);
		menuItem_7.setText("\u95DC\u65BC\u672C\u7A0B\u5F0F");
		
		List list = new List(shell, SWT.BORDER);
		FormData fd_list = new FormData();
		fd_list.bottom = new FormAttachment(100, -10);
		fd_list.left = new FormAttachment(0, 10);
		fd_list.right = new FormAttachment(0, 134);
		list.setLayoutData(fd_list);
		
		Label label = new Label(shell, SWT.NONE);
		fd_list.top = new FormAttachment(label, 6);
		FormData fd_label = new FormData();
		fd_label.right = new FormAttachment(100, -714);
		fd_label.left = new FormAttachment(0, 10);
		fd_label.top = new FormAttachment(0, 10);
		label.setLayoutData(fd_label);
		label.setText("\u806F\u7D61\u4EBA");
		
		Group group = new Group(shell, SWT.NONE);
		group.setText("\u806F\u7D61\u4EBA\u8CC7\u6599");
		group.setLayout(new GridLayout(2, false));
		FormData fd_group = new FormData();
		fd_group.top = new FormAttachment(list, 0, SWT.TOP);
		fd_group.bottom = new FormAttachment(list, 0, SWT.BOTTOM);
		fd_group.left = new FormAttachment(list, 6);
		group.setLayoutData(fd_group);
		
		Label label_1 = new Label(group, SWT.NONE);
		label_1.setText("\u59D3\u540D");
		
		text = new Text(group, SWT.BORDER);
		
		Label label_7 = new Label(group, SWT.NONE);
		label_7.setText("\u6027\u5225");
		new Label(group, SWT.NONE);
		
		Label label_2 = new Label(group, SWT.NONE);
		label_2.setText("\u751F\u65E5");
		
		DateTime dateTime = new DateTime(group, SWT.BORDER);
		
		Label label_3 = new Label(group, SWT.NONE);
		label_3.setText("\u96FB\u8A71");
		
		text_1 = new Text(group, SWT.BORDER);
		GridData gd_text_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_text_1.widthHint = 104;
		text_1.setLayoutData(gd_text_1);
		
		Label label_4 = new Label(group, SWT.NONE);
		label_4.setText("\u5730\u5740");
		
		text_2 = new Text(group, SWT.BORDER);
		GridData gd_text_2 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_text_2.widthHint = 159;
		text_2.setLayoutData(gd_text_2);
		
		Label lblEmail = new Label(group, SWT.NONE);
		lblEmail.setText("E-Mail");
		
		text_3 = new Text(group, SWT.BORDER);
		GridData gd_text_3 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_text_3.widthHint = 168;
		text_3.setLayoutData(gd_text_3);
		
		Label label_5 = new Label(group, SWT.NONE);
		label_5.setText("\u516C\u53F8");
		
		text_4 = new Text(group, SWT.BORDER);
		GridData gd_text_4 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_text_4.widthHint = 176;
		text_4.setLayoutData(gd_text_4);
		
		Group group_1 = new Group(shell, SWT.NONE);
		fd_group.right = new FormAttachment(group_1, -6);
		group_1.setText("\u529F\u80FD");
		group_1.setLayout(new RowLayout(SWT.HORIZONTAL));
		FormData fd_group_1 = new FormData();
		fd_group_1.right = new FormAttachment(100, -231);
		fd_group_1.left = new FormAttachment(0, 454);
		fd_group_1.top = new FormAttachment(0, 31);
		
		Label label_6 = new Label(group, SWT.NONE);
		label_6.setText("\u5099\u8A3B");
		
		text_5 = new Text(group, SWT.BORDER | SWT.MULTI);
		GridData gd_text_5 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 2);
		gd_text_5.heightHint = 104;
		text_5.setLayoutData(gd_text_5);
		new Label(group, SWT.NONE);
		fd_group_1.bottom = new FormAttachment(0, 257);
		group_1.setLayoutData(fd_group_1);
		
		Button btnNewButton = new Button(group_1, SWT.NONE);
		btnNewButton.setLayoutData(new RowData(76, SWT.DEFAULT));
		btnNewButton.setText("\u65B0\u589E\u806F\u7D61\u4EBA");
		
		Button btnNewButton_1 = new Button(group_1, SWT.NONE);
		btnNewButton_1.setLayoutData(new RowData(76, SWT.DEFAULT));
		btnNewButton_1.setText("\u522A\u9664\u806F\u7D61\u4EBA");
		
		Button btnNewButton_2 = new Button(group_1, SWT.NONE);
		btnNewButton_2.setText("\u532F\u5165");
		
		Button button = new Button(group_1, SWT.NONE);
		button.setText("\u532F\u51FA");

	}
}
