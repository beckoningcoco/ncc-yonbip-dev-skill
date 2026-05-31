# |<<

**服务与项目关系 (bd_uh_srv_item / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1115.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvitem | 服务与物品关系主键 | pk_srvitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | eu_type | 关联类别 | eu_type | int |  | 整数 (Integer) |
| 5 | pk_srv | 服务项目 | pk_srv | varchar(20) |  | 医疗服务字典 (uhsrv) |
| 6 | pk_item | 服务收费项目/药品项目 | pk_item | char(20) |  | 主键 (UFID) |
| 7 | flag_def | 默认标志 | flag_def | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | sortno | 优先级顺序号 | sortno | int |  | 整数 (Integer) |
| 9 | quan | 项目数量 | quan | decimal(28, 8) | √ | 数值 (UFDouble) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |