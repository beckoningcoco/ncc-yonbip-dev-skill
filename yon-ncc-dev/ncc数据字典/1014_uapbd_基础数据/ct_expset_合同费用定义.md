# |<<

**合同费用定义 (ct_expset / nc.vo.ct.expset.entity.ExpsetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1659.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_expset | 费用定义主键 | pk_ct_expset | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 集团 | pk_org | varchar(20) |  | 组织_集团 (group) |
| 3 | expitemcode | 费用项编号 | expitemcode | varchar(30) |  | 字符串 (String) |
| 4 | expitemname | 费用项名称 | expitemname | varchar(60) |  | 多语文本 (MultiLangText) |
| 5 | memo | 备注 | memo | varchar(181) |  | 字符串 (String) |