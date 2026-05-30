# |<<

**产成品入库单表头 (ic_finprodin_h / nc.vo.ic.m46.entity.FinProdInHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2901.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 产成品入库单表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 8 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | vtrantypecode | 出入库类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 11 | cprocalbodyoid | 生产库存组织最新版本 | cprocalbodyoid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | cprocalbodyvid | 生产库存组织 | cprocalbodyvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 13 | cprowarehouseid | 生产仓库 | cprowarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 14 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | cdptid | 生产部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | cdptvid | 生产部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 17 | cbizid | 业务员 | cbizid | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 19 | vnote | 备注 | vnote | varchar(200) |  | 字符串 (String) |
| 20 | fbillflag | 单据状态 | fbillflag | int |  | 库存单据状态 (ICBillFlag) |  | 1=删除; |