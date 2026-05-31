# |<<

**专业技术(项目)工作 (hi_psndoc_speitem / nc.vo.hi.psndoc.SpeItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2585.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc | 人员主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 5 | spename | 项目名称 | spename | varchar(128) | √ | 字符串 (String) |
| 6 | spearea | 项目学科领域 | spearea | varchar(128) |  | 字符串 (String) |
| 7 | spesort | 项目类别 | spesort | varchar(128) |  | 字符串 (String) |
| 8 | speunit | 项目下达单位 | speunit | varchar(128) |  | 字符串 (String) |
| 9 | speunitlev | 下达单位级别 | speunitlev | varchar(128) |  | 字符串 (String) |
| 10 | spebegin | 项目起始时间 | spebegin | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 11 | speend | 项目终止时间 | speend | char(10) |  | 模糊日期 (UFLiteralDate) |
| 12 | speben | 项目效益 | speben | varchar(128) |  | 字符串 (String) |
| 13 | spepart | 项目中担任角色 | spepart | varchar(128) |  | 字符串 (String) |
| 14 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 15 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |