# |<<

**业务系统注册表 (ntb_id_sysreg / nc.vo.tb.obj.SysRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3912.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | sysid | 业务系统标识 | sysid | varchar(50) |  | 字符串 (String) |
| 3 | sysname | 业务系统名称 | sysname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | regclass | 注册接口实现类 | regclass | varchar(128) |  | 字符串 (String) |