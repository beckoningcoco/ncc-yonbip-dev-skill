# |<<

**应收余额表 (so_accountmny / nc.vo.credit.engrossmaintain.entity.AccountMnyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5380.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org | 信用控制域 | pk_org | varchar(20) |  | 组织_信用控制域 (creditctlregion) |
| 2 | climittypeid | 额度类型 | climittypeid | varchar(20) |  | 额度类型表 (so_limittype) |
| 3 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 4 | vtrantypecode | 订单类型 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 5 | cchanneltypeid | 渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 6 | csaleorgid | 销售组织 | csaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 7 | cdeptid | 销售部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 8 | cemployeeid | 销售业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 10 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 11 | nmny | 订单应收 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nestarmny | 未确认应收 | nestarmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | narmny | 确认应收 | narmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nsubmny | 冲减应收 | nsubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nnoverifymny | 收款未核销余额 | nnoverifymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | ctrantypeid | 单据类型主键 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |