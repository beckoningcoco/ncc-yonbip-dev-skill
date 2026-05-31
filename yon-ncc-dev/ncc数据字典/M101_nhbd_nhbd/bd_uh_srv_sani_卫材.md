# |<<

**卫材 (bd_uh_srv_sani / com.yonyou.yh.nhis.bd.uhsrv.vo.UHSrvSaniVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srv_sani | 服务卫材主键 | pk_srv_sani | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_sanitype | 卫材分类 | pk_sanitype | varchar(20) | √ | 卫材类型(自定义档案) (Defdoc-030500) |
| 5 | guide | 使用说明 | guide | varchar(256) |  | 备注 (Memo) |
| 6 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 7 | dt_sanitype | 卫材分类编码 | dt_sanitype | varchar(50) |  | 字符串 (String) |