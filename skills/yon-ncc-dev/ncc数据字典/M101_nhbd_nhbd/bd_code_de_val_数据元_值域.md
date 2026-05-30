# |<<

**数据元_值域 (bd_code_de_val / com.yonyou.yh.nhis.bd.code.vo.CodeDeValVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/401.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deval | 数据元值域 | pk_deval | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_人力资源组织版本信息 (hrorg_v) |
| 5 | pk_de | 所属数据元 | pk_de | varchar(50) |  | 字符串 (String) |
| 6 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 7 | valcode | 值编码 | valcode | varchar(30) |  | 字符串 (String) |
| 8 | valcode_std | 国家编码 | valcode_std | varchar(30) |  | 字符串 (String) |
| 9 | valname | 值名称 | valname | varchar(50) |  | 字符串 (String) |
| 10 | valdesc | 值描述 | valdesc | varchar(256) |  | 字符串 (String) |
| 11 | flag_edit | 名称及描述是否可编辑 | flag_edit | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | score | 值对应分值 | score | decimal(14, 2) |  | 数值 (UFDouble) |
| 13 | flag_image | 值图片标志 | flag_image | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | image_val | 值图片 | image_val | image |  | BLOB (BLOB) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 18 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |