# |<<

**科目行数据VO (gl_SubjRowDataVO / nc.vo.gl.contrast.report.subjdata.SubjRowDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2481.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_subjrowdata | 科目行数据标识 | pk_subjrowdata | char(20) | √ | 主键 (UFID) |
| 2 | pk_currtype | 币种标识 | pk_currtype | char(20) |  | 主键 (UFID) |
| 3 | pk_selfaccountingbook | 本方核算账簿标识 | pk_selfaccountingbook | char(20) |  | 主键 (UFID) |
| 4 | pk_accasoa | 科目标识 | pk_accasoa | char(20) |  | 主键 (UFID) |
| 5 | subjdirection | 科目方向 | subjdirection | varchar(50) |  | 字符串 (String) |
| 6 | quantity | 数量 | quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | amount | 原币 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | locamount | 本币 | locamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | groupamount | 集团本币 | groupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | globalamount | 全局本币 | globalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_oppaccountingbook | 对方核算账簿标识 | pk_oppaccountingbook | char(20) |  | 主键 (UFID) |
| 12 | typevalue1 | 档案类型值1 | typevalue1 | varchar(50) |  | 字符串 (String) |
| 13 | typevalue2 | 档案类型值2 | typevalue2 | varchar(50) |  | 字符串 (String) |
| 14 | typevalue3 | 档案类型值3 | typevalue3 | varchar(50) |  | 字符串 (String) |
| 15 | typevalue4 | 档案类型值4 | typevalue4 | varchar(50) |  | 字符串 (String) |
| 16 | typevalue5 | 档案类型值5 | typevalue5 | varchar(50) |  | 字符串 (String) |
| 17 | typevalue6 | 档案类型值6 | typevalue6 | varchar(50) |  | 字符串 (String) |
| 18 | typevalue7 | 档案类型值7 | typevalue7 | varchar(50) |  | 字符串 (String) |
| 19 | typevalue8 | 档案类型值8 | typevalue8 | varchar(50) |  | 字符串 (String) |
| 20 | assshowname | 辅助核算显示名 | assshowname | varchar(50) |  | 字符串 (String) |