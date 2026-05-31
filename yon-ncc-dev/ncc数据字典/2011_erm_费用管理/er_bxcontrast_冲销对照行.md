# |<<

**冲销对照行 (er_bxcontrast / nc.vo.ep.bx.BxcontrastVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1879.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bxcontrast | 冲销对照行标识 | pk_bxcontrast | char(20) | √ | 主键 (UFID) |
| 2 | pk_payorg | 冲借款支付单位 | pk_payorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org | 冲借款单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_finitem | 报销单财务行标识 | pk_finitem | char(20) |  | 主键 (UFID) |
| 5 | pk_bxd | 报销单标识 | pk_bxd | char(20) |  | 主键 (UFID) |
| 6 | pk_jkd | 借款单标识 | pk_jkd | varchar(50) |  | 字符串 (String) |
| 7 | fyybje | 费用原币金额 | fyybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | fybbje | 费用本币金额 | fybbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | cxnd | 会计年度 | cxnd | char(4) |  | 主键 (UFID) |
| 10 | cxqj | 会计期间 | cxqj | char(2) |  | 主键 (UFID) |
| 11 | ybje | 原币金额 | ybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | bbje | 本币金额 | bbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | sxrq | 生效日期 | sxrq | char(19) |  | 日期 (UFDate) |
| 14 | djlxbm | 单据类型编码 | djlxbm | varchar(20) |  | 字符串 (String) |
| 15 | deptid | 借款部门 | deptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | jkbxr | 借款人 | jkbxr | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | jobid | 项目主键 | jobid | varchar(20) |  | 项目 (project) |
| 18 | szxmid | 收支项目主键 | szxmid | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 19 | cxrq | 冲销日期 | cxrq | char(20) |  | 日期 (UFDate) |
| 20 | cjkybje | 冲销原币金额 | cjkybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | cjkbbje | 冲销本币金额 | cjkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | pk_pc | 冲销批次主键 | pk_pc | char(20) |  | 主键 (UFID) |
| 23 | bxdjbh | 报销单号 | bxdjbh | varchar(30) |  | 字符串 (String) |
| 24 | jkdjbh | 借款单号 | jkdjbh | varchar(30) |  | 字符串 (String) |
| 25 | sxbz | 生效标志 | sxbz | int |  | 生效标志 (effectstatus) |  | 0=未生效; |