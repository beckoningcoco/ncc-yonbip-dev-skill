# |<<

**郑州医院登封医保登记 (zzhp_pv_df / com.yonyou.yh.nhis.hp.zz.dengfeng.vo.ZZHPPVDFVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6402.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dfhp | 主键 | pk_dfhp | char(20) | √ | 主键 (UFID) |
| 2 | pk_pvcode | 医院就诊号 | pk_pvcode | varchar(50) |  | 字符串 (String) |
| 3 | code_hp | 医保卡号 | code_hp | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |