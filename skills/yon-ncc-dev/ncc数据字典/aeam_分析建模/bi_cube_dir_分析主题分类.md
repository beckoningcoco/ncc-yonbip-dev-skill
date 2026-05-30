# |<<

**分析主题分类 (bi_cube_dir / nc.vo.bi.cube.CubeDirVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1192.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | 分类 | guid | char(20) | √ | 主键 (UFID) |
| 2 | dirname | 名称 | dirname | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pguid | 上级分类 | pguid | varchar(20) |  | 分析主题分类 (cubedir) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | sysinit | 系统预置 | sysinit | varchar(50) |  | 字符串 (String) |
| 7 | moduleid | 所属模块 | moduleid | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建者 | creator | varchar(20) |  | 用户 (user) |
| 9 | modifier | 修改者 | modifier | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |