# |<<

**内部授信类别 (tmpub_icctype / nc.vo.tmpub.icctype.ICCTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5766.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_icctype | 授信类别主键 | pk_icctype | char(20) | √ | 主键 (UFID) |
| 2 | code | 类型编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 类型名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | remark | 备注 | remark | varchar(181) |  | 字符串 (String) |
| 5 | systemflag | 是否系统预置 | systemflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | enablestate | 状态 | enablestate | int |  | 启用状态 (EnableStatusEnum) |  | 0=已启用; |