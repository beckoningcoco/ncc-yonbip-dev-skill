# |<<

**岗位基本信息 (om_post / nc.vo.om.post.PostVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3950.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post | 岗位主键 | pk_post | char(20) | √ | 主键 (UFID) |
| 2 | postcode | 岗位编码 | postcode | varchar(40) | √ | 字符串 (String) |
| 3 | postname | 岗位名称 | postname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 5 | pk_dept | 所属部门 | pk_dept | varchar(20) | √ | HR部门 (hrdept) |
| 6 | pk_job | 所属职务 | pk_job | varchar(20) |  | 职务 (om_job) |
| 7 | pk_postseries | 岗位序列 | pk_postseries | varchar(20) | √ | 岗位序列 (postseries) |
| 8 | pk_poststd | 基准岗位 | pk_poststd | varchar(20) |  | 基准岗位 (poststd) |
| 9 | suporior | 直接上级 | suporior | varchar(20) |  | 岗位基本信息 (om_post) |
| 10 | junior | 直接下级 | junior | varchar(4000) |  | 字符串 (String) |
| 11 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 12 | seq | SEQ | seq | varchar(50) |  | 字符串 (String) |
| 13 | builddate | 成立日期 | builddate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 14 | employment | 职业 | employment | varchar(20) |  | 职业(自定义档案) (Defdoc-HR016_0xx) |
| 15 | worktype | 工种 | worktype | varchar(20) |  | 工种(自定义档案) (Defdoc-BD004_0xx) |
| 16 | worksumm | 工作概要 | worksumm | varchar(1024) |  | 备注 (Memo) |
| 17 | reqedu | 最低学历要求 | reqedu | varchar(20) |  | 学历(自定义档案) (Defdoc-HR008_0xx) |
| 18 | reqsex | 性别要求 | reqsex | int |  | 性别 (sex) |  | 1=男; |