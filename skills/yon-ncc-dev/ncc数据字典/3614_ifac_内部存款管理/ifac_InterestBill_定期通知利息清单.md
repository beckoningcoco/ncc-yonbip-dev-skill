# |<<

**定期通知利息清单 (ifac_InterestBill / nc.vo.ifac.interestbill.InterestBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3092.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_interest | 主键 | pk_interest | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | offsetstate | 冲补状态 | offsetstate | int |  | 冲补状态 (OffsetStateEnum) |  | -1=无需冲补; |