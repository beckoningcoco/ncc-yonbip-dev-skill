# |<<

**成本组件 (bd_costcomponent / nc.vo.bd.bdcostcomponent.entity.BDCostComponentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/407.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costcomponent | 成本组件主键 | pk_costcomponent | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | vcostcomponentcode | 成本组件编码 | vcostcomponentcode | varchar(50) |  | 字符串 (String) |
| 5 | vcostcomponentname | 成本组件名称 | vcostcomponentname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 7 | bdcomptype | 成本组件类型 | bdcomptype | int |  | 成本组件类型 (BDCostComponentTypeEnum) |  | 1=系统预置; |