# |<<

**借款单 (er_jkzb / nc.vo.ep.bx.JKHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1905.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jkbx | 借款单标识 | pk_jkbx | char(20) | √ | 主键 (UFID) |
| 2 | fydeptid | 费用承担部门 | fydeptid | varchar(20) |  | 组织_部门 (dept) |
| 3 | fydeptid_v | 费用承担部门版本 | fydeptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 4 | deptid | 借款人部门 | deptid | varchar(20) |  | 组织_部门 (dept) |
| 5 | deptid_v | 借款人部门版本 | deptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 6 | fydwbm | 费用承担单位 | fydwbm | varchar(20) |  | 组织 (org) |
| 7 | fydwbm_v | 费用承担单位版本 | fydwbm_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 8 | dwbm | 借款人单位 | dwbm | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 9 | dwbm_v | 借款人单位版本 | dwbm_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 10 | pk_org | 借款单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_org_v | 借款单位版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 12 | pk_checkele | 核算要素 | pk_checkele | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 13 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 14 | pk_pcorg_v | 利润中心版本 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 15 | pk_fiorg | 财务组织(作废) | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 16 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | reimrule | 借款标准 | reimrule | varchar(512) |  | 主键 (UFID) |
| 18 | mngaccid | 管理账户 | mngaccid | char(20) |  | 主键 (UFID) |
| 19 | paydate | 支付日期 | paydate | char(19) |  | 日期 (UFDate) |
| 20 | payman | 支付人 | payman | varchar(20) |  | 用户 (user) |
| 21 | total | 合计金额 | total | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | hkybje | 还款原币金额 | hkybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | hkbbje | 还款本币金额 | hkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | zfybje | 支付原币金额 | zfybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | zfbbje | 支付本币金额 | zfbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | payflag | 支付状态 | payflag | int |  | 支付状态 (paystatus) |  | 1=未支付; |