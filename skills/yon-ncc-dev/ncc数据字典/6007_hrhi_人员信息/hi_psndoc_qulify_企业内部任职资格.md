# |<<

**企业内部任职资格 (hi_psndoc_qulify / nc.vo.hi.psndoc.QulifyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2580.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 任职资格主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | authenlevel | 认证级别 | authenlevel | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | authentype | 认证类型 | authentype | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | judgeteam | 评审组 | judgeteam | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | jury | 评审委员会 | jury | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | authencategory | 认证类别 | authencategory | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 8 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 9 | authenyear | 认证年度 | authenyear | varchar(8) |  | 字符串 (String) |
| 10 | authendate | 认证日期 | authendate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 11 | effectyear | 认证有效年限 | effectyear | int |  | 整数 (Integer) |
| 12 | expiredate | 认证到期日期 | expiredate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 13 | lastflag | 当前最新记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 15 | pk_source | 认证来源记录 | pk_source | char(20) |  | 主键 (UFID) |
| 16 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 17 | pk_org | 所属组织 | pk_org | char(20) |  | 主键 (UFID) |
| 18 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 20 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |