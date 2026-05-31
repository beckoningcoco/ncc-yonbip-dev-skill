# |<<

**数据集记录项上传信息管理 (bd_uh_ph_rec_pi / com.yonyou.yh.nhis.bd.phrecpi.vo.PhRecPiVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1085.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phrecpi | 上传信息主键 | pk_phrecpi | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | tblname | 上传至表名 | tblname | varchar(20) |  | 记录项上传表名(自定义档案) (Defdoc-070005) |
| 5 | pk_mctype | 上传时对应医疗术语类型 | pk_mctype | varchar(20) |  | 医疗术语类型(自定义档案) (Defdoc-060003) |
| 6 | dt_mctype | 上传时对应医疗术语类型编码 | dt_mctype | varchar(50) |  | 字符串 (String) |
| 7 | pk_phrec | 记录项主键 | pk_phrec | varchar(50) |  | 字符串 (String) |
| 8 | pk_phds | 数据集 | pk_phds | varchar(50) |  | 字符串 (String) |
| 9 | pk_phdg | 记录组 | pk_phdg | varchar(50) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |