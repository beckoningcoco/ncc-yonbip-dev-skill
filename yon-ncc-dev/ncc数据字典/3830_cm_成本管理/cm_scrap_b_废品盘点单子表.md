# |<<

**废品盘点单子表 (cm_scrap_b / nc.vo.cm.bill.bill0314.ScrapItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1504.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cscrap_bid | 子表id | cscrap_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | char(20) |  | 主键 (UFID) |
| 5 | cscrapid | 主表id | cscrapid | char(20) |  | 主键 (UFID) |
| 6 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 7 | nnum | 数量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 8 | istatus | 状态 | istatus | int |  | 单据状态(成本) (CMStatusEnum) | 1 | 1=自由; |