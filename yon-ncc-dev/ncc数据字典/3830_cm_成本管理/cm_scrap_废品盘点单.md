# |<<

**废品盘点单 (cm_scrap / nc.vo.cm.bill.bill0314.ScrapHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1503.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cscrapid | 废品单主键 | cscrapid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织主键 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 库存组织版本主键 | pk_org_v | char(20) |  | 主键 (UFID) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) | √ | 字符串 (String) |
| 6 | dbusinessdate | 业务日期 | dbusinessdate | char(19) | √ | 日期 (UFDate) |
| 7 | cperiod | 会计期间 | cperiod | varchar(7) | √ | 字符串 (String) |
| 8 | ccostcenterid | 成本中心 | ccostcenterid | char(20) | √ | 成本中心 (resacostcenter) |
| 9 | clastcostcenter | 末道成本中心 | clastcostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 10 | vnote | 备注 | vnote | varchar(181) |  | 备注 (Memo) |
| 11 | isourcetype | 来源类型 | isourcetype | int |  | 来源类型(成本) (CMSourceTypeEnum) | 1 | 1=自制; |