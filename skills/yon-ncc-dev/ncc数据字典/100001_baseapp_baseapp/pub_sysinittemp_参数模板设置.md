# |<<

**参数模板设置 (pub_sysinittemp / nc.vo.pub.paratemp.SysinittempVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4776.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysinittemp | 主键 | pk_sysinittemp | char(20) | √ | 主键 (UFID) |
| 2 | initcode | 参数代码 | initcode | varchar(50) |  | 字符串 (String) |
| 3 | initname | 参数名称 | initname | varchar(500) |  | 字符串 (String) |
| 4 | remark | 参数说明 | remark | varchar(500) |  | 字符串 (String) |
| 5 | defaultvalue | 默认值 | defaultvalue | varchar(500) |  | 字符串 (String) |
| 6 | valuelist | 取值范围 | valuelist | varchar(400) |  | 字符串 (String) |
| 7 | stateflag | 编辑样式 | stateflag | int | √ | 整数 (Integer) |
| 8 | domainflag | 模块名 | domainflag | varchar(30) |  | 字符串 (String) |
| 9 | sysindex | 序号 | sysindex | int |  | 整数 (Integer) |
| 10 | valuetype | 值类型 | valuetype | int | √ | 整数 (Integer) |
| 11 | sysflag | 默认值是否为java类 | sysflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 12 | groupcode | 组编码 | groupcode | varchar(20) |  | 字符串 (String) |
| 13 | mutexflag | 互斥值 | mutexflag | char(10) |  | 模糊日期 (UFLiteralDate) |
| 14 | mainflag | 是否主组参数 | mainflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 15 | groupname | 组名称 | groupname | varchar(250) |  | 字符串 (String) |
| 16 | showflag | 是否显示 | showflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 17 | checkclass | 检查类 | checkclass | varchar(100) |  | 字符串 (String) |
| 18 | dataclass | deprecated | dataclass | varchar(50) |  | 字符串 (String) |
| 19 | afterclass | 已被遗弃 | afterclass | varchar(50) |  | 字符串 (String) |
| 20 | pk_refinfo | 参照控件 | pk_refinfo | varchar(50) |  | 字符串 (String) |
| 21 | editcomponentctrlclass | 参照属性修改控制类 | editcomponentctrlclass | varchar(100) |  | 字符串 (String) |
| 22 | pk_orgtype | 组织类型 | pk_orgtype | char(20) | √ | 组织其它_组织类型 (orgtype) |
| 23 | orgtypeconvertmode | 组织类型转换模式 | orgtypeconvertmode | varchar(50) | √ | 字符串 (String) |
| 24 | dataoriginflag | attrDisplayName | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |