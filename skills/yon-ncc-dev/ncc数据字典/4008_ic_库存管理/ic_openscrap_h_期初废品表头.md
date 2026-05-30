# |<<

**期初废品表头 (ic_openscrap_h / nc.vo.ic.m43.entity.OpenScrapHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2946.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 期初废品表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 8 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | cbizid | 业务员 | cbizid | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | vtrantypecode | 出入库类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 12 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 13 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 14 | cwarehouseid | 废品仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 15 | fbillflag | 单据状态 | fbillflag | int |  | 库存单据状态 (ICBillFlag) |  | 1=删除; |