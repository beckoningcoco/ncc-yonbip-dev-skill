# |<<

**自动下载设置主表 (ebank_download_h / nc.vo.obm.ebankdownload.EbankDownLoadHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1764.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_download_h | 主键 | pk_ebank_download_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 组织版本号 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | billmaker | 用户id | billmaker | varchar(20) |  | 用户 (user) |
| 6 | funtype | 方案 | funtype | varchar(50) |  | 字符串 (String) |
| 7 | deffuntype | 默认方案 | deffuntype | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | funcode | 方案代码 | funcode | varchar(10) |  | 字符串 (String) |
| 9 | obmdef1 | 自定义1 | obmdef1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | obmdef2 | 自定义2 | obmdef2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | obmdef3 | 自定义3 | obmdef3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | obmdef4 | 自定义4 | obmdef4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | obmdef5 | 自定义5 | obmdef5 | varchar(101) |  | 自定义项 (Custom) |