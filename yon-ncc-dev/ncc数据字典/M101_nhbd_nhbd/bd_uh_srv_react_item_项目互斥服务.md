# |<<

**项目互斥服务 (bd_uh_srv_react_item / com.yonyou.yh.nhis.bd.srvexclusive.vo.SrvExcluItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1124.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvreactitem | 主键 | pk_srvreactitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 5 | pk_srv | 服务项目 | pk_srv | varchar(50) |  | 字符串 (String) |