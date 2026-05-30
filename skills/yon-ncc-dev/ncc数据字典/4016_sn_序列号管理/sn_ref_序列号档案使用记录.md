# |<<

**序列号档案使用记录 (sn_ref / nc.vo.sn.refdoc.entity.SnRefDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5375.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_query | 序列号档案子表主键 | pk_query | char(20) | √ | 主键 (UFID) |
| 2 | pk_sndoc | 序列号档案主键 | pk_sndoc | varchar(20) |  | 字符串 (String) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 6 | cbillhid | 单据表头主键 | cbillhid | varchar(20) |  | 字符串 (String) |
| 7 | cbillbid | 单据表体主键 | cbillbid | varchar(20) |  | 字符串 (String) |
| 8 | cbilllid | 单据孙表主键 | cbilllid | varchar(20) |  | 字符串 (String) |
| 9 | cbilltype | 单据类型 | cbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | cmaterialoid | 最新版本物料编码 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 12 | cmaterialoid_chg | 改判前最新版本物料编码 | cmaterialoid_chg | varchar(20) |  | 物料基本信息 (material_v) |
| 13 | cmaterialvid_chg | 改判前物料编码 | cmaterialvid_chg | varchar(20) |  | 物料基本信息（多版本） (material) |
| 14 | vbatchcode | 库存批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 15 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 16 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 17 | pk_stockorg | 库存组织最新版本 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 18 | pk_stockorg_v | 库存组织 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 19 | pk_stordoc | 仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 20 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 21 | bisreturned | 退货 | bisreturned | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 23 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 24 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 25 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 26 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 27 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 28 | cproducteddept | 生产部门最新版本 | cproducteddept | varchar(20) |  | 组织_部门 (dept) |
| 29 | cproducteddept_v | 生产部门 | cproducteddept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 30 | vsncode | 序列号 | vsncode | varchar(128) |  | 字符串 (String) |
| 31 | vmasncode | 唯一性校验码 | vmasncode | varchar(148) |  | 字符串 (String) |
| 32 | vpartcode | 分区码 | vpartcode | varchar(32) |  | 字符串 (String) |
| 33 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 34 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 35 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 36 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 37 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 38 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 39 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |