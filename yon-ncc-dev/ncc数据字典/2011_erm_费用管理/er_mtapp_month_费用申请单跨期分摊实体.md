# |<<

**费用申请单跨期分摊实体 (er_mtapp_month / nc.vo.erm.matterapp.ext.MtappMonthExtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1911.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_month | 唯一标识 | pk_mtapp_month | char(20) | √ | 主键 (UFID) |
| 2 | pk_mtapp_bill | 费用申请单 | pk_mtapp_bill | varchar(20) | √ | 费用申请单 (mtapp_bill) |
| 3 | pk_mtapp_detail | 费用申请单明细 | pk_mtapp_detail | char(20) | √ | 费用申请单明细 (mtapp_detail) |
| 4 | assume_org | 费用承担单位 | assume_org | char(20) | √ | 组织 (org) |
| 5 | pk_pcorg | 利润中心 | pk_pcorg | char(20) | √ | 利润中心 (profitcenter) |
| 6 | billdate | 分摊日期 | billdate | char(19) | √ | 日期 (UFDate) |
| 7 | orig_amount | 原币金额 | orig_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | org_amount | 组织本币金额 | org_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | group_amount | 集团本币金额 | group_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | global_amount | 全局本币金额 | global_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 12 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |