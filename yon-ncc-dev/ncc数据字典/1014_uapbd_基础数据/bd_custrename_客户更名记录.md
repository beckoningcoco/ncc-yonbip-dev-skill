# |<<

**客户更名记录 (bd_custrename / nc.vo.bd.cust.custrename.CustRenameVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/447.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custrename | 客户更名记录 | pk_custrename | char(20) | √ | 主键 (UFID) |
| 2 | pk_customer | 客户基本信息 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 3 | custrename | 客户名称 | custrename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | begindate | 生效日期 | begindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 5 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 6 | source | 更名来源 | source | smallint |  | 更名来源 (source) |  | 1=申请单创建; |