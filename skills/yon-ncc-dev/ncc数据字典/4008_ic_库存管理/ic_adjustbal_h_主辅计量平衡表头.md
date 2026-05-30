# |<<

**主辅计量平衡表头 (ic_adjustbal_h / nc.vo.ic.m52.entity.AdjustBalHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2867.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 主辅计量平衡表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 10 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 11 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 12 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 13 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 14 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 15 | vbilltypecode | 单据类型 | vbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 16 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 17 | dstartdate | 起始日期 | dstartdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 18 | denddate | 截止日期 | denddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 19 | vadjusttype | 调差类型 | vadjusttype | int |  | 调差类型 (adjusttype) |  | 4=主辅计量平衡; |