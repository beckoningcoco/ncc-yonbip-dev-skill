# |<<

**快捷键注册实体 (pub_hotkeyregister / nc.vo.pub.hotkey.HotkeyRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4733.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hotkey | 主键 | pk_hotkey | char(20) | √ | 主键 (UFID) |
| 2 | alt_meta_ctrl_shift | 复合快捷键 | alt_meta_ctrl_shift | integer |  | 整数 (Integer) |
| 3 | button_name | 按钮名称 | button_name | varchar(50) |  | 字符串 (String) |
| 4 | display | 快捷键显示名称 | display | varchar(50) |  | 字符串 (String) |
| 5 | fun_code | 父对象标识 | fun_code | varchar(50) |  | 字符串 (String) |
| 6 | hotkey | 快捷键码 | hotkey | varchar(50) |  | 字符串 (String) |
| 7 | ownertype | 所属对象类型 | ownertype | integer |  | 按钮所属关系枚举 (btnowninfoenum) |  | 0=节点按钮; |