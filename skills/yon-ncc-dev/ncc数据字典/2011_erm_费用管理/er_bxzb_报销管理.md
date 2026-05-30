# |<<

**报销管理 (er_bxzb / nc.vo.ep.bx.BXExtHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1882.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jkbx | 借款报销单标识 | pk_jkbx | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 原借款报销单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_checkele | 核算要素 | pk_checkele | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 7 | reimrule | 报销标准 | reimrule | varchar(512) |  | 主键 (UFID) |
| 8 | mngaccid | 管理账户 | mngaccid | char(20) |  | 主键 (UFID) |
| 9 | total | 合计金额 | total | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | paydate | 支付日期 | paydate | char(19) |  | 日期 (UFDate) |
| 11 | payman | 支付人 | payman | varchar(20) |  | 用户 (user) |
| 12 | payflag | 支付状态 | payflag | int |  | 支付状态 (paystatus) |  | 1=未支付; |