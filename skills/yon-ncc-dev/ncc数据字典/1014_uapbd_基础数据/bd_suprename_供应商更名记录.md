# |<<

**供应商更名记录 (bd_suprename / nc.vo.bd.supplier.suprename.SupRenameVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/987.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_suprename | 供应商更名主键 | pk_suprename | char(20) | √ | 主键 (UFID) |
| 2 | pk_supplier | 供应商主键 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 3 | suprename | 供应商名称 | suprename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | begindate | 生效日期 | begindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 5 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 6 | source | 更名来源 | source | int |  | 更名来源 (source) |  | 1=申请单创建; |