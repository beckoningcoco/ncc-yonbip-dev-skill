# |<<

**开发接口实现 (hr_impl / nc.vo.hr.devitf.DevItfImplVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2674.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_impl | 开发接口实现表主键 | pk_impl | char(20) | √ | 主键 (UFID) |
| 2 | pk_itf | 接口定义表主键 | pk_itf | char(20) | √ | 开发接口定义 (devitf_def) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 5 | itf_code | 接口编码 | itf_code | varchar(40) |  | 字符串 (String) |
| 6 | impl_name | 实现名称 | impl_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | modulename | 模块名称 | modulename | varchar(20) |  | 字符串 (String) |
| 8 | default_flag | 是否是接口的默认实现 | default_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | user_def_flag | 是否是用户自定义 | user_def_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | impl_desc | 说明 | impl_desc | varchar(500) |  | 字符串 (String) |
| 11 | impl_class_name | 实现类的全类名 | impl_class_name | varchar(101) |  | 自定义项 (Custom) |