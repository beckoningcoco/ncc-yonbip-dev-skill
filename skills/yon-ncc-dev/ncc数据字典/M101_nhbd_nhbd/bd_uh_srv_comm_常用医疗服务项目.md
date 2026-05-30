# |<<

**常用医疗服务项目 (bd_uh_srv_comm / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvCommVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1108.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvcomm | 常用项目主键 | pk_srvcomm | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code_srvtype | 医嘱类型编码 | code_srvtype | varchar(50) |  | 字符串 (String) |
| 5 | pk_psn | 使用人员 | pk_psn | char(20) |  | 主键 (UFID) |
| 6 | pk_srv | 服务 | pk_srv | char(20) |  | 主键 (UFID) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |