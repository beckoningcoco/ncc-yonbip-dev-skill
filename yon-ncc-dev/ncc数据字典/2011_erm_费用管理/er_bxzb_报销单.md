# |<<

**报销单 (er_bxzb / nc.vo.ep.bx.BXHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1881.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jkbx | 报销单标识 | pk_jkbx | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 报销单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 报销单位版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_fiorg | 财务组织废弃 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | iscostshare | 是否分摊 | iscostshare | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 7 | isexpamt | 是否待摊 | isexpamt | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 8 | start_period | 开始摊销期间 | start_period | varchar(20) |  | 会计月份 (accperiodmonth) |
| 9 | total_period | 总摊销期 | total_period | int |  | 整数 (Integer) |
| 10 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 11 | pk_pcorg_v | 利润中心版本 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 12 | pk_checkele | 核算要素 | pk_checkele | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 13 | reimrule | 报销标准 | reimrule | varchar(512) |  | 主键 (UFID) |
| 14 | mngaccid | 管理账户 | mngaccid | char(20) |  | 主键 (UFID) |
| 15 | total | 合计金额 | total | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | paydate | 支付日期 | paydate | char(19) |  | 日期 (UFDate) |
| 17 | payman | 支付人 | payman | varchar(20) |  | 用户 (user) |
| 18 | payflag | 支付状态 | payflag | int |  | 支付状态 (paystatus) |  | 1=未支付; |