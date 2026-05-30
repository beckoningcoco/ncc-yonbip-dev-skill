# |<<

**生产报告消耗信息 (mm_wr_pick / nc.vo.mmpac.wr.entity.WrPickVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3798.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wr_pick | 消耗信息 | pk_wr_pick | char(20) | √ | 主键 (UFID) |
| 2 | pk_wr_product | 产出信息 | pk_wr_product | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | vprowno | 序号 | vprowno | varchar(20) |  | 字符串 (String) |
| 7 | cppickmid | 备料计划 | cppickmid | varchar(50) |  | 字符串 (String) |
| 8 | vppickmvbillcode | 备料计划单号 | vppickmvbillcode | varchar(40) |  | 字符串 (String) |
| 9 | cppickm_bid | 备料计划行 | cppickm_bid | varchar(50) |  | 字符串 (String) |
| 10 | vppickmvrowno | 备料计划行号 | vppickmvrowno | varchar(20) |  | 字符串 (String) |
| 11 | cpmaterialid | 材料最新版本 | cpmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cpmaterialvid | 材料 | cpmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | cpwkid | 工作中心 | cpwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 14 | cpdeliverorgid | 发料组织最新版本 | cpdeliverorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 15 | cpdeliverorgvid | 发料组织 | cpdeliverorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 16 | cpdeliverstockid | 发料仓库 | cpdeliverstockid | varchar(20) |  | 仓库 (stordoc) |
| 17 | vpbatchcodeid | 批次 | vpbatchcodeid | char(20) |  | 主键 (UFID) |
| 18 | vpbatchcode | 批次号 | vpbatchcode | varchar(50) |  | 字符串 (String) |
| 19 | nppicknum | 消耗主数量 | nppicknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nppickastnum | 消耗数量 | nppickastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | cpqualitylevelid | 质量等级 | cpqualitylevelid | varchar(50) |  | 字符串 (String) |
| 22 | cpunitid | 主单位 | cpunitid | varchar(20) |  | 计量单位 (measdoc) |
| 23 | cpastunitid | 单位 | cpastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 24 | vpchangerate | 换算率 | vpchangerate | varchar(60) |  | 字符串 (String) |
| 25 | vpnote | 备注 | vpnote | varchar(181) |  | 备注 (Memo) |
| 26 | cpvendorid | 供应商 | cpvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 27 | cpproductorid | 生产厂商 | cpproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 28 | cpprojectid | 项目 | cpprojectid | varchar(20) |  | 项目 (project) |
| 29 | cpcustomerid | 客户 | cpcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 30 | cpffileid | 特征码 | cpffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 31 | cwr_pickid | 消耗信息v61 | cwr_pickid | char(20) |  | 主键 (UFID) |
| 32 | fbackflushtype | 倒冲方式 | fbackflushtype | int |  | 倒冲方式 (backflushtype) |  | 1=不倒冲; |