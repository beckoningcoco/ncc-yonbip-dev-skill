# |<<

**通知目录 (uh_tp_ntf / com.yonyou.yh.nhis.itf.sds.vo.TPNtfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6284.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ntf | 通知主键 | pk_ntf | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | code_org | 医院编码 | code_org | varchar(50) |  | 字符串 (String) |
| 5 | code_ntf | 编码 | code_ntf | varchar(30) |  | 字符串 (String) |
| 6 | name_ntf | 名称 | name_ntf | varchar(50) |  | 字符串 (String) |
| 7 | txt_ntf | 内容 | txt_ntf | varchar(50) |  | 字符串 (String) |
| 8 | dt_ntftype | 通知类型 | dt_ntftype | varchar(20) |  | 字符串 (String) |
| 9 | code_ntftype | 通知类型编码 | code_ntftype | varchar(20) |  | 字符串 (String) |
| 10 | date_ntf | 通知日期 | date_ntf | char(19) |  | 日期时间 (UFDateTime) |
| 11 | url_ntf | 通知URL | url_ntf | varchar(30) |  | 字符串 (String) |
| 12 | flag_confirm | 确认标志 | flag_confirm | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | date_confirm | 确认日期 | date_confirm | char(19) |  | 日期时间 (UFDateTime) |
| 14 | photo_ntf | 通知图片 | photo_ntf | varchar(100) |  | 字符串 (String) |
| 15 | img_prcs_ty_cd | 图片处理类型 | img_prcs_ty_cd | varchar(100) |  | 字符串 (String) |
| 16 | img_extsn_txt | 图片扩展名 | img_extsn_txt | varchar(100) |  | 字符串 (String) |
| 17 | cndv_clss_cd | 接收终端分类 | cndv_clss_cd | varchar(20) |  | 字符串 (String) |
| 18 | pk_pati | 患者主键 | pk_pati | char(20) |  | 主键 (UFID) |
| 19 | paticode | 患者编码 | paticode | varchar(30) |  | 字符串 (String) |
| 20 | eu_status | 通知状态 | eu_status | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 22 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 23 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | modifier | 最后修改人 | modifier | char(20) |  | 主键 (UFID) |
| 25 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |