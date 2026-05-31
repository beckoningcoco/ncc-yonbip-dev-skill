# |<<

**报废入库单 (mm_procon_bfinstock / nc.vo.mmpac.proconsole.entity.ProConBfInStockVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3745.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cid | 报废入库单明细 | cid | varchar(50) | √ | 字符串 (String) |
| 2 | coperheadid | 表头 | coperheadid | varchar(50) |  | 字符串 (String) |
| 3 | cgeneralhid | 生产报废入库单表头 | cgeneralhid | char(20) |  | 主键 (UFID) |
| 4 | cgeneralbid | 生产报废入库单表体 | cgeneralbid | char(20) |  | 主键 (UFID) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 库存组织最新 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 8 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 9 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | cwarehouseid | 废品仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 11 | vtrantypecode | 出入库类型 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 12 | ctrantypeid | 出入库类型pk | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 13 | cdptid | 部门最新 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 14 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | cbizid | 业务员 | cbizid | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 17 | cmaterialoid | 物料最新 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 18 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 19 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 21 | vchangerate | 换算率 | vchangerate | varchar(20) |  | 字符串 (String) |
| 22 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 23 | nshouldnum | 应收主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nshouldassistnum | 应收数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nnum | 实收主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nassistnum | 实收数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | dbizdate | 入库日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 28 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 29 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 30 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 31 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 32 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 33 | dproductdate | 生产日期 | dproductdate | char(19) |  | 日期 (UFDate) |
| 34 | vsrcbillcode | 来源单据号 | vsrcbillcode | varchar(50) |  | 字符串 (String) |
| 35 | vsrcbilltype | 来源单据类型 | vsrcbilltype | varchar(50) |  | 字符串 (String) |
| 36 | vsrcbillid | 来源单据 | vsrcbillid | varchar(50) |  | 字符串 (String) |
| 37 | vsrcbillbid | 来源单据行 | vsrcbillbid | varchar(50) |  | 字符串 (String) |
| 38 | tsrcts | 来源时间戳 | tsrcts | char(19) |  | 日期时间 (UFDateTime) |
| 39 | fbillstatus | 单据状态 | fbillstatus | varchar(50) |  | 字符串 (String) |
| 40 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 45 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 46 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 47 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 48 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 49 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 50 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |