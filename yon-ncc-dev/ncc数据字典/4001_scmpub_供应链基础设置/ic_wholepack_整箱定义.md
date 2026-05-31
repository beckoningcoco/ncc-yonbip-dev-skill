# |<<

**整箱定义 (ic_wholepack / nc.vo.scmf.ic.mwholepack.WholePackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3016.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cwholepackid | 整箱定义id | cwholepackid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 公司最新版本 | pk_org | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | pk_org_v | 公司 | pk_org_v | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | cpacktypeid | 包装箱类型编码 | cpacktypeid | varchar(20) |  | 包装箱类型 (PackTypeVO) |
| 6 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | npacknum | 数量 | npacknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | cmaterialclass | 物料基本分类 | cmaterialclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 10 | nsinglegrossweight | 单箱毛重 | nsinglegrossweight | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | nsinglesuttleweight | 单箱净重 | nsinglesuttleweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | cpackageunit | 内包装单位 | cpackageunit | varchar(20) |  | 计量单位 (measdoc) |
| 13 | npackagenum | 内包装数 | npackagenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | defpackage | 默认包装箱 | defpackage | char(1) |  | 布尔类型 (UFBoolean) |