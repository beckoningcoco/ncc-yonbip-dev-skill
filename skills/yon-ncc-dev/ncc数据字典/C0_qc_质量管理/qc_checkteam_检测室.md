# |<<

**检测室 (qc_checkteam / nc.vo.qc.checkteam.entity.CheckTeamHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4838.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkteam | 检测室PK | pk_checkteam | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 检测中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 3 | vcheckteamcode | 检测室编码 | vcheckteamcode | varchar(50) |  | 字符串 (String) |
| 4 | vcheckteamname | 检测室名称 | vcheckteamname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |