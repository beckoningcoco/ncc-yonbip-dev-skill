# |<<

**批次追溯明细 (mmpac_batchtrace_b / nc.vo.mmpac.batchass.trace.entity.BatchTraceBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3806.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbatchtracebid | 批次追溯明细 | cbatchtracebid | varchar(50) | √ | 字符串 (String) |
| 2 | cbatchtraceid | 批次追溯 | cbatchtraceid | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org_v | 发料库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_org | 发料库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | cwarehouseid | 发料仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 7 | vbillcode | 材料出库单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 8 | dbilldate | 材料出库单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | ctrantypeid | 出入库类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | cdrawcalbodyvid | 领料库存组织 | cdrawcalbodyvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 11 | cdrawcalbodyoid | 领料库存组织最新版本 | cdrawcalbodyoid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | cdrawwarehouseid | 领料仓库 | cdrawwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 13 | cdptvid | 领料部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 14 | cdptid | 领料部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 15 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 16 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 17 | vstockbatchcodeid | 库存批次号id | vstockbatchcodeid | char(20) |  | 主键 (UFID) |
| 18 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(50) |  | 字符串 (String) |
| 19 | dbizdate | 出库日期 | dbizdate | varchar(19) |  | 日期 (UFDate) |
| 20 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 21 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 22 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 23 | nassistnum | 实发数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nnum | 实发主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nbindassnum | 关联数量 | nbindassnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nbindnum | 关联主数量 | nbindnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 28 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 29 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 30 | customerid | 客户 | customerid | varchar(20) |  | 客户基本信息 (customer) |
| 31 | cbffileid | 特征码 | cbffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 32 | cmaterialoutid | 材料出库单 | cmaterialoutid | char(20) |  | 主键 (UFID) |
| 33 | cmaterialoutbid | 材料出库单行 | cmaterialoutbid | char(20) |  | 主键 (UFID) |
| 34 | cbserialcodeid | 序列号标识 | cbserialcodeid | char(20) |  | 主键 (UFID) |
| 35 | vbserialcode | 序列号 | vbserialcode | varchar(40) |  | 字符串 (String) |
| 36 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 37 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 38 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 39 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 45 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |