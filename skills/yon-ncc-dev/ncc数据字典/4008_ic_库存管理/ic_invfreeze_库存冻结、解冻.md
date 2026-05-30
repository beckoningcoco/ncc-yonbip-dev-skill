# |<<

**库存冻结、解冻 (ic_invfreeze / nc.vo.ic.m4z.entity.FreezeThawVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2918.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfreezeid | 冻结主键 | cfreezeid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_onhanddim | 现存量维度主键 | pk_onhanddim | varchar(20) |  | 现存量维度 (OnhandDimVO) |
| 4 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 7 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | ccorrespondhid | 报检单主键 | ccorrespondhid | varchar(20) |  | 主键 (UFID) |
| 10 | ccorrespondbid | 报检单单表体主键 | ccorrespondbid | varchar(20) |  | 主键 (UFID) |
| 11 | ccorrespondcode | 报检单号 | ccorrespondcode | varchar(40) |  | 字符串 (String) |
| 12 | ccorrespondrowno | 报检单行号 | ccorrespondrowno | varchar(40) |  | 字符串 (String) |
| 13 | nfrzastnum | 冻结数量 | nfrzastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nfrznum | 冻结主数量 | nfrznum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nfrzgrsnum | 冻结毛重 | nfrzgrsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | cfreezerid | 冻结人 | cfreezerid | varchar(20) |  | 用户 (user) |
| 17 | dfreezedate | 冻结日期 | dfreezedate | varchar(19) |  | 日期 (UFDate) |
| 18 | cthawerid | 解冻人 | cthawerid | varchar(20) |  | 用户 (user) |
| 19 | dthawdate | 解冻日期 | dthawdate | varchar(19) |  | 日期 (UFDate) |
| 20 | ndefrznum | 解冻主数量 | ndefrznum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ndefrzastnum | 解冻数量 | ndefrzastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | ndefrzgrsnum | 解冻毛重 | ndefrzgrsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | breverseflag | 修订 | breverseflag | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | cthawsourceid | 解冻来源主键 | cthawsourceid | char(20) |  | 字符串 (String) |
| 25 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |