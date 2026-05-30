# |<<

**营销费用归集单主实体 (me_combine / nc.vo.me.collectorder.entity.CombineHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3607.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_combine | 营销费用归集单 | pk_combine | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 5 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 6 | ctrantypeid | 归集单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vtrantypecode | 归集单类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 8 | caccountperiod | 会计期间 | caccountperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 9 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 10 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillStatus) |  | -1=自由; |