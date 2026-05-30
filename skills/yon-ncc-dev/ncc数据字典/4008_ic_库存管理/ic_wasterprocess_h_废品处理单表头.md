# |<<

**废品处理单表头 (ic_wasterprocess_h / nc.vo.ic.m4p.entity.WasterProcessHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3014.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 废品单表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | cwarehouseid | 废品仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 8 | vtrantypecode | 废品处理类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 11 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 12 | cinbsrid | 经手人 | cinbsrid | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | fbillflag | 单据状态 | fbillflag | int |  | 库存单据状态 (ICBillFlag) |  | 1=删除; |