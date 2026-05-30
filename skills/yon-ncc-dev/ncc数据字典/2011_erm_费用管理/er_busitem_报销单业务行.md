# |<<

**报销单业务行 (er_busitem / nc.vo.ep.bx.BXBusItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1878.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busitem | 报销单业务行标识 | pk_busitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_reimtype | 报销类型 | pk_reimtype | varchar(20) |  | 报销类型 (ReimType) |
| 3 | pk_jkbx | 报销单标识 | pk_jkbx | char(20) |  | 主键 (UFID) |
| 4 | tablecode | 页签编码 | tablecode | varchar(20) |  | 字符串 (String) |
| 5 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | szxmid | 收支项目 | szxmid | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 7 | rowno | 行号 | rowno | int |  | 整数 (Integer) |
| 8 | ybje | 原币金额 | ybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | bbje | 本币金额 | bbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | hkybje | 还款金额 | hkybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | hkbbje | 还款本币金额 | hkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | zfybje | 支付金额 | zfybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | zfbbje | 支付本币金额 | zfbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | cjkybje | 冲借款金额 | cjkybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | cjkbbje | 冲借款本币金额 | cjkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | groupbbje | 集团本币金额 | groupbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | grouphkbbje | 集团还款本币金额 | grouphkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | groupzfbbje | 集团支付本币金额 | groupzfbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | groupcjkbbje | 集团冲借款本币金额 | groupcjkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | globalbbje | 全局本币金额 | globalbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | globalhkbbje | 全局还款本币金额 | globalhkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | globalzfbbje | 全局支付本币金额 | globalzfbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | globalcjkbbje | 全局冲借款本币金额 | globalcjkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 25 | pk_pcorg_v | 利润中心历史版本 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 26 | pk_checkele | 核算要素 | pk_checkele | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 27 | jobid | 项目 | jobid | varchar(20) |  | 项目 (project) |
| 28 | projecttask | 项目任务 | projecttask | varchar(20) |  | 项目任务 (WBS) |
| 29 | pk_resacostcenter | 成本中心 | pk_resacostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 30 | pk_item | 费用申请单 | pk_item | varchar(50) |  | 字符串 (String) |
| 31 | srcbilltype | 来源单据类型 | srcbilltype | varchar(50) |  | 字符串 (String) |
| 32 | srctype | 来源类型 | srctype | varchar(50) |  | 字符串 (String) |
| 33 | pk_mtapp_detail | 费用申请单明细 | pk_mtapp_detail | varchar(50) |  | 字符串 (String) |
| 34 | pk_proline | 产品线 | pk_proline | varchar(20) |  | 产品线 (prodline) |
| 35 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 36 | dwbm | 报销人单位 | dwbm | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 37 | deptid | 报销人部门 | deptid | varchar(20) |  | 组织_部门 (dept) |
| 38 | jkbxr | 报销人 | jkbxr | varchar(20) |  | 人员基本信息 (psndoc) |
| 39 | paytarget | 收款对象 | paytarget | int |  | 收款对象 (enum) |  | 0=员工; |