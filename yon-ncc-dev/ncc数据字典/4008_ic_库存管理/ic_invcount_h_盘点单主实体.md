# |<<

**盘点单主实体 (ic_invcount_h / nc.vo.ic.m4r.entity.InvCountHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2916.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cspecialhid | 盘点单表头主键 | cspecialhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | vtrantypecode | 盘点类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 8 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | dcountdate | 盘点日期 | dcountdate | varchar(19) |  | 日期 (UFDate) |
| 11 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 12 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 14 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | countoperator | 盘点人 | countoperator | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | fbillflag | 单据状态 | fbillflag | int |  | 库存调整单单据状态枚举 (enum) | 1 | 1=自由; |