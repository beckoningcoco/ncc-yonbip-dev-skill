# |<<

**授信类别 (tmpub_cctype / nc.vo.tmpub.cctype.CCTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5756.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cctype | 授信类别主键 | pk_cctype | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(75) |  | 多语文本 (MultiLangText) |
| 4 | remark | 备注 | remark | varchar(181) |  | 字符串 (String) |
| 5 | systemflag | 系统标识 | systemflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (EnablingStatus) |  | 0=已启用; |